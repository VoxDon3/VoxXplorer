.class public final synthetic Lax/w5/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/w5/v;


# direct methods
.method public synthetic constructor <init>(Lax/w5/v;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/t;->q:Lax/w5/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w5/t;->q:Lax/w5/v;

    invoke-static {v0}, Lax/w5/v;->b(Lax/w5/v;)V

    return-void
.end method
