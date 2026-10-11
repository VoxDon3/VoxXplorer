.class public final synthetic Lax/f1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/f1/m;


# direct methods
.method public synthetic constructor <init>(Lax/f1/m;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/f1/l;->q:Lax/f1/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/f1/l;->q:Lax/f1/m;

    invoke-static {v0}, Lax/f1/m;->a(Lax/f1/m;)V

    return-void
.end method
