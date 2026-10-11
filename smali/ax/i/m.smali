.class public final synthetic Lax/i/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/i/n;


# direct methods
.method public synthetic constructor <init>(Lax/i/n;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i/m;->q:Lax/i/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i/m;->q:Lax/i/n;

    invoke-static {v0}, Lax/i/n;->a(Lax/i/n;)V

    return-void
.end method
