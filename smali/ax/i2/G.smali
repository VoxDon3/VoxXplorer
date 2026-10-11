.class public final synthetic Lax/i2/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/i2/m;


# direct methods
.method public synthetic constructor <init>(Lax/i2/m;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i2/G;->q:Lax/i2/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i2/G;->q:Lax/i2/m;

    invoke-virtual {v0}, Lax/i2/m;->l()V

    return-void
.end method
